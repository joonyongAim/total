// const tabBtn = document.querySelectorAll('.tab-button');
// const tabContent = document.querySelectorAll('.tab-content');

// function addC(elem, className) {
//   elem.classList.add(className);
// }

// for(let j=0; j<tabBtn.length; j++) {
//   tabBtn[j].addEventListener('click', () => {

//     for(let i=0; i<tabBtn.length; i++) {
//       tabBtn[i].classList.remove('select');
//       tabContent[i].classList.remove('show');
//     }
//     addC(tabBtn[j], 'select');
//     addC(tabContent[j], 'show');
//     // tabBtn[j].classList.add('select');
//     // tabContent[j].classList.add('show');
//   })

// }

// tabBtn[1].addEventListener('click', () => {

//   for(let i=0; i<tabBtn.length; i++) {
//     tabBtn[i].classList.remove('select');
//     tabContent[i].classList.remove('show');
//   }

//   tabBtn[1].classList.add('select');
//   tabContent[1].classList.add('show');
// })

// tabBtn[2].addEventListener('click', () => {

//   for(let i=0; i<tabBtn.length; i++) {
//     tabBtn[i].classList.remove('select');
//     tabContent[i].classList.remove('show');
//   }

//   tabBtn[2].classList.add('select');
//   tabContent[2].classList.add('show');
// })


const tabBtn = $('.tab-button');
const tabContent = $('.tab-content');

function showTab(index) {
  tabBtn.removeClass('select');
  tabContent.removeClass('show');
  tabBtn.eq(index).addClass('select');
  tabContent.eq(index).addClass('show');
}

$('.list').on('click', (e) => {

  let index = e.target.dataset.index;

  if(index != undefined)
    showTab(e.target.dataset.index);

  // if(e.target == document.querySelectorAll('.tab-button')[0])
  //   showTab(0);
  // if(e.target == document.querySelectorAll('.tab-button')[1])
  //   showTab(1);
  // if($(e.target).is($('.tab-button').eq(2)))
  //   showTab(2);  
})

// for(let i=0; i<tabBtn.length; i++) {
//   tabBtn.eq(i).on('click', () => {
//     tabBtn.removeClass('select');
//     tabContent.removeClass('show');

//     tabBtn.eq(i).addClass('select');
//     tabContent.eq(i).addClass('show');
//   })
// }





