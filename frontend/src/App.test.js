import { render, screen } from '@testing-library/react';
import App from './App';
import MyComponent from './MyComponent';

test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});

test('prints 10', () => {
  render(<MyComponent />);
  const number = document.getElementById("paragraphWithTen").innerHTML;
  expect(number).toEqual("10");
});